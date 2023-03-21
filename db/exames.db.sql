BEGIN TRANSACTION;
DROP TABLE IF EXISTS "Pacientes";
CREATE TABLE IF NOT EXISTS "Pacientes" (
	"IdPaciente"	INTEGER NOT NULL UNIQUE,
	"Nome"	TEXT NOT NULL,
	PRIMARY KEY("IdPaciente" AUTOINCREMENT)
);
DROP TABLE IF EXISTS "Observacoes";
CREATE TABLE IF NOT EXISTS "Observacoes" (
	"IdObservacao"	INTEGER NOT NULL UNIQUE,
	"IdResultado"	INTEGER NOT NULL,
	"Observacao"	TEXT NOT NULL,
	FOREIGN KEY("IdResultado") REFERENCES "Resultados"("IdResultado"),
	PRIMARY KEY("IdObservacao" AUTOINCREMENT)
);
DROP TABLE IF EXISTS "Exames";
CREATE TABLE IF NOT EXISTS "Exames" (
	"IdExame"	INTEGER NOT NULL UNIQUE,
	"Nome"	INTEGER NOT NULL,
	"Descricao"	INTEGER NOT NULL,
	PRIMARY KEY("IdExame" AUTOINCREMENT)
);
DROP TABLE IF EXISTS "Resultados";
CREATE TABLE IF NOT EXISTS "Resultados" (
	"IdResultado"	INTEGER NOT NULL UNIQUE,
	"IdExame"	INTEGER NOT NULL,
	"IdPaciente"INTEGER NOT NULL,
	"Data"	TEXT NOT NULL,
	"Resultado"	TEXT NOT NULL,
	FOREIGN KEY("IdExame") REFERENCES "Exames"("IdExame"),
	FOREIGN KEY("IdPaciente") REFERENCES "Pacientes"("IdPaciente"),
	PRIMARY KEY("IdResultado" AUTOINCREMENT)
);
INSERT INTO "Pacientes" VALUES (14,'Tod');
INSERT INTO "Pacientes" VALUES (15,'Billy');
INSERT INTO "Pacientes" VALUES (16,'Miley');
INSERT INTO "Pacientes" VALUES (17,'Bobby');
INSERT INTO "Pacientes" VALUES (18,'Malazan');
INSERT INTO "Pacientes" VALUES (19,'Bizon');
INSERT INTO "Pacientes" VALUES (20,'Jonas Ribeiro');
INSERT INTO "Pacientes" VALUES (21,'Lups de Fucs');
INSERT INTO "Pacientes" VALUES (23,'Mishima');
INSERT INTO "Pacientes" VALUES (24,'Carlos Mishima');
INSERT INTO "Pacientes" VALUES (25,'John Mishima');
INSERT INTO "Pacientes" VALUES (27,'Granger');
INSERT INTO "Pacientes" VALUES (28,'Teste');
INSERT INTO "Pacientes" VALUES (29,'Include');
INSERT INTO "Pacientes" VALUES (33,'Déltico');
INSERT INTO "Pacientes" VALUES (34,'John Breakpoint');
INSERT INTO "Pacientes" VALUES (35,'Mãe');
INSERT INTO "Observacoes" VALUES (1,2,'Tá condenado.');
INSERT INTO "Observacoes" VALUES (2,3,'Tá condenado.');
INSERT INTO "Exames" VALUES (3,'Charlie new','Charlie desc new');
INSERT INTO "Exames" VALUES (4,'Delta','Delta desc');
INSERT INTO "Exames" VALUES (5,'Echo','Echo desc');
INSERT INTO "Exames" VALUES (7,'Beta''s back','Beta''s amazing');
INSERT INTO "Exames" VALUES (8,'Includeling','Includeling desc');
COMMIT;
