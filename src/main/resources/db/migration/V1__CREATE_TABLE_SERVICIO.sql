CREATE TABLE SERVICIO (
	id_servicio INTEGER NOT NULL PRIMARY KEY,
    id_tipo_servicio INTEGER NOT NULL references tipo_servicio(id_tipo_servicio),
    descripcion varchar(200),
    coord_x real,
    coord_y real
);