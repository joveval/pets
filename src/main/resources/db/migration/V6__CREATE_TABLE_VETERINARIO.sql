CREATE TABLE VETERINARIO(
	ID_VETERINARIO INTEGER NOT NULL PRIMARY KEY,
	ID_PERSONA INTEGER NOT NULL REFERENCES PERSONA(ID_PERSONA),
    COLEGIADO BOOL
);