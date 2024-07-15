create database EcoMundo
go
use EcoMundo
go	
CREATE TABLE "ProcesoSalida"(
    "id" BIGINT IDENTITY(1, 1) NOT NULL,
    "CodigoMaterialN" INT NOT NULL,
    "CodigoMaterialM" INT NOT NULL,
	"Precio" DECIMAL(10, 2) NOT NULL,
);
ALTER TABLE --modificar la tabla proceso de salida para poner la llave primaria asignada (asignando el PK)
    "ProcesoSalida" ADD CONSTRAINT "procesosalida_id_primary" PRIMARY KEY("id");
CREATE TABLE "Piezas"(
    "CodigoPieza" INT IDENTITY(1, 1) NOT NULL,
    "CodigoMaquina" INT NULL,
    "NombrePieza" varchar(50) NULL,
    "IDGerente" INT NOT NULL,
    "IDSucursal" INT NOT NULL
);
ALTER TABLE 
    "Piezas" ADD CONSTRAINT "piezas_codigopieza_primary" PRIMARY KEY("CodigoPieza");
CREATE TABLE "Maquinas"(
    "CodigoMaquina" INT IDENTITY(1, 1) NOT NULL,
    "NombreMaquina" VARCHAR(50) NULL,
    "IDGerente" INT NOT NULL,
    "IDSucursal" INT NOT NULL
);
ALTER TABLE
    "Maquinas" ADD CONSTRAINT "maquinas_codigomaquina_primary" PRIMARY KEY("CodigoMaquina");
CREATE TABLE "MaterialSalida"(
    "CodigoSalida" INT IDENTITY(1, 1) NOT NULL,
    "HorarioSalida" TIME NULL,
    "SalidaPeso" DECIMAL(10, 2) NULL,
    "Ubicacion" VARCHAR(50) NULL,
    "SalidaTipo" VARCHAR(50) NULL,
    "Precio" DECIMAL(10, 2) NOT NULL,
	"Fecha" DATE NOT NULL,
    "IDGerente" INT NULL

);
ALTER TABLE
    "MaterialSalida" ADD CONSTRAINT "materialsalida_codigosalida_primary" PRIMARY KEY("CodigoSalida");
CREATE TABLE "Empleado"(
    "IDEmpleado" INT IDENTITY(1, 1) NOT NULL,
    "Nombre" VARCHAR(50) NULL,
    "Apellido" VARCHAR(50) NULL,
    "CodigoSucursal" INT NULL,
    "Identificacion" VARCHAR(50) NULL,
    "FechaEntrada" DATE NULL
);
ALTER TABLE
    "Empleado" ADD CONSTRAINT "empleado_idempleado_primary" PRIMARY KEY("IDEmpleado");
CREATE TABLE "Gastos"(
    "CodigoGasto" INT IDENTITY(1, 1) NOT NULL,
    "EnergiaElectrica" DECIMAL(10, 2) NULL,
    "Mantenimiento" DECIMAL(10, 2) NULL,
    "IDGerente" INT NULL,
    "Mes" VARCHAR(20) NOT NULL,
    "Año" BIGINT NOT NULL
);
ALTER TABLE
    "Gastos" ADD CONSTRAINT "gastos_codigogasto_primary" PRIMARY KEY("CodigoGasto");
CREATE TABLE "ProcesoEntrada"(
    "IDEmpleadoN" INT NULL,
    "CodigoMaterialM" INT NULL,
    "IDProcesoEntrada" BIGINT IDENTITY(1, 1) NOT NULL
);
ALTER TABLE
    "ProcesoEntrada" ADD CONSTRAINT "procesoentrada_idprocesoentrada_primary" PRIMARY KEY("IDProcesoEntrada");
CREATE TABLE "Cambios"(
    "CodigoCambio" BIGINT IDENTITY(1, 1) NOT NULL,
    "CodigoMaquina" INT NULL,
    "CodigoPieza" INT NULL
);
ALTER TABLE
    "Cambios" ADD CONSTRAINT "cambios_codigocambio_primary" PRIMARY KEY("CodigoCambio");

CREATE TABLE "Chequeo"(
    "CodigoChequeo" INT IDENTITY(1, 1) NOT NULL,
    "ResultadoChequeo" VARCHAR(50) NULL,
    "NumeroMantenimiento" INT NULL
);
ALTER TABLE
    "Chequeo" ADD CONSTRAINT "chequeo_codigochequeo_primary" PRIMARY KEY("CodigoChequeo");
CREATE TABLE "MantenimientoMaquina"(
    "CodigoMaquina" INT NOT NULL,
    "Fecha" DATE NOT NULL,
    "SeHizoLimpieza" BIT NOT NULL,
    "NumeroMantenimiento" INT IDENTITY(1, 1) NOT NULL
);
ALTER TABLE
    "MantenimientoMaquina" ADD CONSTRAINT "mantenimientomaquina_numeromantenimiento_primary" PRIMARY KEY("NumeroMantenimiento");
CREATE TABLE "MaterialEntrada"(
    "CodigoMaterial" INT IDENTITY(1, 1) NOT NULL,
    "EntradaTipo" VARCHAR(50) NULL,
    "HorarioEntrada" TIME NULL,
    "EntradaPeso" DECIMAL(10, 2) NULL,
    "EntradaOrigen" VARCHAR(50) NULL,
    "date" DATE NOT NULL
);
ALTER TABLE
    "MaterialEntrada" ADD CONSTRAINT "materialentrada_codigomaterial_primary" PRIMARY KEY("CodigoMaterial");
CREATE TABLE "MantenimientoCambios"(
    "id" BIGINT IDENTITY(1, 1) NOT NULL,
    "NumeroMantenimientoN" INT NOT NULL,
    "CodigoCambioM" BIGINT NOT NULL
);
ALTER TABLE
    "MantenimientoCambios" ADD CONSTRAINT "mantenimientocambios_id_primary" PRIMARY KEY("id");
CREATE TABLE "Gerente"(
    "IDGerente" INT IDENTITY(1, 1) NOT NULL UNIQUE,
    "IDSucursal" INT NULL,
    "IDEmpleado" INT NULL
);
ALTER TABLE
    "Gerente" ADD CONSTRAINT "gerente_idgerente_primary" PRIMARY KEY("IDGerente");
CREATE TABLE "Sucursal"(
    "IDSucursal" INT IDENTITY(1, 1) NOT NULL,
    "Ubicacion" VARCHAR(100) NULL,
    "Contacto" VARCHAR(50) NULL,
    "Telefono" VARCHAR(20) NULL
);
ALTER TABLE
    "Sucursal" ADD CONSTRAINT "sucursal_idsucursal_primary" PRIMARY KEY("IDSucursal");

--asignacion de todos los FK
ALTER TABLE
    "Piezas" ADD CONSTRAINT "piezas_idgerente_foreign" FOREIGN KEY("IDGerente") REFERENCES "Gerente"("IDGerente");

ALTER TABLE
    "ProcesoEntrada" ADD CONSTRAINT "procesoentrada_codigomaterialm_foreign" FOREIGN KEY("CodigoMaterialM") REFERENCES "MaterialEntrada"("CodigoMaterial");
ALTER TABLE
    "Cambios" ADD CONSTRAINT "cambios_codigomaquina_foreign" FOREIGN KEY("CodigoMaquina") REFERENCES "Maquinas"("CodigoMaquina");
ALTER TABLE
    "Piezas" ADD CONSTRAINT "piezas_codigomaquina_foreign" FOREIGN KEY("CodigoMaquina") REFERENCES "Maquinas"("CodigoMaquina");
ALTER TABLE
    "MantenimientoCambios" ADD CONSTRAINT "mantenimientocambios_numeromantenimienton_foreign" FOREIGN KEY("NumeroMantenimientoN") REFERENCES "MantenimientoMaquina"("NumeroMantenimiento");
ALTER TABLE
    "Maquinas" ADD CONSTRAINT "maquinas_idsucursal_foreign" FOREIGN KEY("IDSucursal") REFERENCES "Sucursal"("IDSucursal");
ALTER TABLE
    "Gerente" ADD CONSTRAINT "gerente_idsucursal_foreign" FOREIGN KEY("IDSucursal") REFERENCES "Sucursal"("IDSucursal");
ALTER TABLE
    "Cambios" ADD CONSTRAINT "cambios_codigopieza_foreign" FOREIGN KEY("CodigoPieza") REFERENCES "Piezas"("CodigoPieza");
ALTER TABLE
    "Gerente" ADD CONSTRAINT "gerente_idempleado_foreign" FOREIGN KEY("IDEmpleado") REFERENCES "Empleado"("IDEmpleado");
ALTER TABLE
    "Chequeo" ADD CONSTRAINT "chequeo_numeromantenimiento_foreign" FOREIGN KEY("NumeroMantenimiento") REFERENCES "MantenimientoMaquina"("NumeroMantenimiento");
ALTER TABLE
    "Maquinas" ADD CONSTRAINT "maquinas_idgerente_foreign" FOREIGN KEY("IDGerente") REFERENCES "Gerente"("IDGerente");
ALTER TABLE
    "ProcesoSalida" ADD CONSTRAINT "procesosalida_codigomaterialm_foreign" FOREIGN KEY("CodigoMaterialM") REFERENCES "MaterialSalida"("CodigoSalida");
ALTER TABLE
    "MantenimientoCambios" ADD CONSTRAINT "mantenimientocambios_codigocambiom_foreign" FOREIGN KEY("CodigoCambioM") REFERENCES "Cambios"("CodigoCambio");
ALTER TABLE
    "Gastos" ADD CONSTRAINT "gastos_idgerente_foreign" FOREIGN KEY("IDGerente") REFERENCES "Gerente"("IDGerente");
ALTER TABLE
    "Piezas" ADD CONSTRAINT "piezas_idsucursal_foreign" FOREIGN KEY("IDSucursal") REFERENCES "Sucursal"("IDSucursal");
ALTER TABLE
    "ProcesoEntrada" ADD CONSTRAINT "procesoentrada_idempleadon_foreign" FOREIGN KEY("IDEmpleadoN") REFERENCES "Empleado"("IDEmpleado");
ALTER TABLE
    "ProcesoSalida" ADD CONSTRAINT "procesosalida_codigomaterialn_foreign" FOREIGN KEY("CodigoMaterialN") REFERENCES "MaterialEntrada"("CodigoMaterial");
ALTER TABLE
    "Empleado" ADD CONSTRAINT "empleado_codigosucursal_foreign" FOREIGN KEY("CodigoSucursal") REFERENCES "Sucursal"("IDSucursal");
ALTER TABLE
    "MantenimientoMaquina" ADD CONSTRAINT "mantenimientomaquina_codigomaquina_foreign" FOREIGN KEY("CodigoMaquina") REFERENCES "Maquinas"("CodigoMaquina");
	alter table Gastos
	-- restriccion para solo poner meses y no otras cosas
add constraint  VerificarMesG check (mes = 'enero' or mes = 'febrero' or mes = 'marzo' or mes = 'abril' or mes = 'mayo' 
or mes = 'junio' or mes = 'julio' or mes = 'agosto' or mes = 'septiembre' or mes = 'octubre' or mes = 'noviembre' or mes = 'diciembre');
	alter table Gastos
add constraint VerificarAñoG check (Año>=2024)