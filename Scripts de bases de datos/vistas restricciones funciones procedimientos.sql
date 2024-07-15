--vistas
-- Vista para obtener detalles de materiales procesados de una sucursal en específico
use EcoMundo
go
drop view DetallesMaterialesProcesados
go
CREATE VIEW DetallesMaterialesProcesados AS 
SELECT 
    MS.CodigoSalida,
    MS.HorarioSalida,
    MS.SalidaPeso,
    MS.Ubicacion,
    MS.SalidaTipo,
    MS.Precio,
    MS.Fecha,
	S.IDSucursal
FROM 
    Sucursal S
    JOIN Empleado E ON S.IDSucursal = E.CodigoSucursal
	JOIN ProcesoEntrada PE on PE.IDEmpleadoN = E.IDEmpleado
	JOIN MaterialEntrada ME ON PE.CodigoMaterialM = ME.CodigoMaterial
	JOIN ProcesoSalida PS ON ME.CodigoMaterial = PS.CodigoMaterialN
    JOIN MaterialSalida MS ON PS.CodigoMaterialN = MS.CodigoSalida
	go

select * from DetallesMaterialesProcesados WHERE 
    IDSucursal = 2 -- Par�metro para filtrar por sucursal específica
GROUP BY CodigoSalida, HorarioSalida, SalidaPeso, Ubicacion, SalidaTipo, Precio, Fecha, IDSucursal
	go
	

-- Vista para obtener los gastos por gerente
CREATE VIEW [dbo].[VistaFinanzasGerente] AS
SELECT G.IDGerente, GTO.Mes, SUM(GTO.EnergiaElectrica) as EnergiaElectica, SUM(GTO.Mantenimiento) as Mantenimiento
FROM Gerente G
JOIN Gastos GTO ON G.IDGerente = GTO. IDGerente
GROUP BY G.IDGerente, GTO.Mes;
GO

--funciones
-- Función para Obtener el Nombre Completo de un Empleado
CREATE FUNCTION ObtenerNombreCompletoEmpleado(
    @IDEmpleado INT
)
RETURNS VARCHAR(101)
AS
BEGIN
    DECLARE @NombreCompleto VARCHAR(101);

    SELECT @NombreCompleto = Nombre + ' ' + Apellido
    FROM Empleado
    WHERE IDEmpleado = @IDEmpleado;

    RETURN @NombreCompleto;
END;
GO

go
-- Función para calcular el total de gastos por gerente
CREATE FUNCTION TotalGastosGerente(@GerenteID INT)
RETURNS DECIMAL(10, 2)
AS
BEGIN
    DECLARE @TotalGastos DECIMAL(10, 2);
    SELECT @TotalGastos = SUM(EnergiaElectrica + Mantenimiento)
    FROM Gastos
    WHERE Gerente_ID = @GerenteID;
    RETURN @TotalGastos;
END;
go

--procedimientos almacenados
-- Procedimiento para registrar una nueva entrada de material
CREATE PROCEDURE RegistrarMaterialEntrada
    @CodigoMaterial INT,
    @Tipo VARCHAR(50),
    @HorarioEntrada TIME,
    @Peso DECIMAL(10, 2),
    @Origen VARCHAR(50),
    @Proceso VARCHAR(50)
AS
BEGIN
    INSERT INTO MaterialEntrada (CodigoMaterial, Tipo, HorarioEntrada, Peso, Origen, Proceso)
    VALUES (@CodigoMaterial, @Tipo, @HorarioEntrada, @Peso, @Origen, @Proceso);
END;

-- Procedimiento para registrar una nueva salida de material
CREATE PROCEDURE RegistrarMaterialSalida
    @CodigoMaterial INT,
    @HorarioSalida TIME,
    @SalidaPeso DECIMAL(10, 2),
    @Ubicacion VARCHAR(50),
    @SalidaTipo VARCHAR(50)
AS
BEGIN
    INSERT INTO MaterialSalida (CodigoSalida, HorarioSalida, SalidaPeso, Ubicacion, SalidaTipo)
    VALUES (@CodigoMaterial, @HorarioSalida, @SalidaPeso, @Ubicacion, @SalidaTipo);
END;


--procedimientos almacenados
-- Procedimiento para registrar una nueva entrada de material
CREATE PROCEDURE sp_RegistrarMaterialEntrada
    @CodigoMaterial INT,
    @Tipo VARCHAR(50),
    @HorarioEntrada TIME,
    @Peso DECIMAL(10, 2),
    @Origen VARCHAR(50),
    @Proceso VARCHAR(50)
AS
BEGIN
    INSERT INTO MaterialEntrada (CodigoMaterial, Tipo, HorarioEntrada, Peso, Origen, Proceso)
    VALUES (@CodigoMaterial, @Tipo, @HorarioEntrada, @Peso, @Origen, @Proceso);
END;
GO

-- Procedimiento para registrar una nueva salida de material
CREATE PROCEDURE sp_RegistrarMaterialSalida
    @CodigoMaterial INT,
    @HorarioSalida TIME,
    @SalidaPeso DECIMAL(10, 2),
    @Ubicacion VARCHAR(50),
    @SalidaTipo VARCHAR(50)
AS
BEGIN
    INSERT INTO MaterialSalida (CodigoSalida, HorarioSalida, SalidaPeso, Ubicacion, SalidaTipo)
    VALUES (@CodigoMaterial, @HorarioSalida, @SalidaPeso, @Ubicacion, @SalidaTipo);
END;
GO


--restricciones
-- Restricción para asegurar que el peso del material de entrada sea positivo
ALTER TABLE MaterialEntrada
ADD CONSTRAINT CHK_PesoPositivo CHECK (EntradaPeso > 0);

-- Restricción para asegurar que el peso del material de salida sea positivo
ALTER TABLE MaterialSalida
ADD CONSTRAINT CHK_SalidaPesoPositivo CHECK (SalidaPeso > 0);

-- Restricción para asegurar que las fechas de mantenimiento sean válidas
ALTER TABLE Mantenimiento
ADD CONSTRAINT CHK_FechaMantenimiento CHECK (JornadaMantenimiento <= GETDATE());
