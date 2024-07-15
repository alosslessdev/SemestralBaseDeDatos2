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
	

-- Vista para obtener las ganancias y gastos por gerente
CREATE VIEW VistaFinanzasGerente AS
SELECT G.IDGerente, G.Cargo, GA.Mes, GA.Cantidad AS Ganancias, GTO.EnergiaElectrica, GTO.Mantenimiento
FROM Gerente G
JOIN Ganancias GA ON G.IDGerente = GA.Gerente_ID
JOIN Gastos GTO ON G.IDGerente = GTO.Gerente_ID;


--funciones
-- Función para calcular el total de ganancias por gerente
CREATE FUNCTION TotalGananciasGerente(@GerenteID INT)
RETURNS DECIMAL(10, 2)
AS
BEGIN
    DECLARE @TotalGanancias DECIMAL(10, 2);
    SELECT @TotalGanancias = SUM(Cantidad)
    FROM Ganancias
    WHERE Gerente_ID = @GerenteID;
    RETURN @TotalGanancias;
END;
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
    INSERT INTO MaterialSalida (CodigoMaterial, HorarioSalida, SalidaPeso, Ubicacion, SalidaTipo)
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

-- Consultar las vistas
SELECT * FROM VistaMaterialesSucursal;
SELECT * FROM VistaFinanzasGerente;

-- Ejecutar funciones
SELECT dbo.TotalGananciasGerente(1) AS TotalGanancias;
SELECT dbo.TotalGastosGerente(1) AS TotalGastos;

-- Ejecutar procedimientos almacenados
EXEC RegistrarMaterialEntrada 2, 'Metal', '09:00:00', 200.00, 'Industrial', 'Procesado';
EXEC RegistrarMaterialSalida 2, '13:00:00', 195.00, 'Centro de Reciclaje', 'Metal';
