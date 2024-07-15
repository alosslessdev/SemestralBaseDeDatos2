use MASTER
go


create login UserTest with password = 'asdf';
GO

use EcoMundo
GO
create user entrypoint for login UserTest
GO


grant insert on Cambios to entrypoint
grant insert on Chequeo to entrypoint
grant insert on Empleado to entrypoint
grant insert on Gastos to entrypoint
grant insert on Gerente to entrypoint
grant insert on MantenimientoCambios to entrypoint
grant insert on MantenimientoMaquina to entrypoint
grant insert on Maquinas to entrypoint
grant insert on MaterialEntrada to entrypoint
grant insert on MaterialSalida to entrypoint
grant insert on Piezas to entrypoint
grant insert on ProcesoEntrada to entrypoint
grant insert on ProcesoSalida to entrypoint
grant insert on Sucursal to entrypoint
grant select on Cambios to entrypoint
grant select on Chequeo to entrypoint
grant select on Empleado to entrypoint
grant select on Gastos to entrypoint
grant select on Gerente to entrypoint
grant select on MantenimientoCambios to entrypoint
grant select on MantenimientoMaquina to entrypoint
grant select on Maquinas to entrypoint
grant select on MaterialEntrada to entrypoint
grant select on MaterialSalida to entrypoint
grant select on Piezas to entrypoint
grant select on ProcesoEntrada to entrypoint
grant select on ProcesoSalida to entrypoint
grant select on Sucursal to entrypoint