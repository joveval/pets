CREATE TABLE TRANSACCION (
    ID_TRANSACCION INTEGER NOT NULL PRIMARY KEY,
    ID_REL_CLIENTE_MASCOTA INTEGER NOT NULL REFERENCES REL_CLIENTE_MASCOTA(ID_REL_CLIENTE_MASCOTA),
    ID_SERVICIO INTEGER NOT NULL REFERENCES SERVICIO(ID_SERVICIO)
);