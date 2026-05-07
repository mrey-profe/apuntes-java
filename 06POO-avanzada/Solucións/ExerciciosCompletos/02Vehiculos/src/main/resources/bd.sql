CREATE DATABASE Vehiculos;

USE Vehiculos;

CREATE TABLE Camiones (
                          modelo VARCHAR(50) NOT NULL,
                          numeroDeSerie INTEGER PRIMARY KEY,
                          tipoCombustible ENUM('JET_A1', 'AVGAS', 'GASOLINA', 'DIESEL') DEFAULT 'DIESEL' NOT NULL,
                          cantidadCombustible DOUBLE DEFAULT 0 NOT NULL,
                          capacidadCarga INTEGER NOT NULL,
                          cargaActual INTEGER NOT NULL,
                          unidadCarga INTEGER NOT NULL,
                          conductor VARCHAR(100) NOT NULL
);


-- Insertar camiones en la tabla Camiones
INSERT INTO Camiones (modelo, numeroDeSerie, tipoCombustible, cantidadCombustible, capacidadCarga, cargaActual, unidadCarga, conductor) VALUES
                                                                                                                                            ('Volvo FH16', 1, 'DIESEL', 300.0, 20000.0, 15000.0, 10, 'Juan Pérez'),
                                                                                                                                            ('Mercedes Actros', 2, 'DIESEL', 250.0, 18000.0, 12000.0, 10, 'Ana Gómez'),
                                                                                                                                            ('Scania R450', 3, 'DIESEL', 350.0, 22000.0, 20000.0, 10, 'Carlos Ruiz'),
                                                                                                                                            ('DAF XF', 4, 'DIESEL', 320.0, 21000.0, 18000.0, 10, 'María Fernández'),
                                                                                                                                            ('MAN TGX', 5, 'DIESEL', 310.0, 19500.0, 17500.0, 10, 'Luis Martínez'),
                                                                                                                                            ('Iveco Stralis', 6, 'DIESEL', 280.0, 17000.0, 15000.0, 10, 'Elena Torres'),
                                                                                                                                            ('Renault T', 7, 'DIESEL', 290.0, 16000.0, 13000.0, 10, 'Miguel López'),
                                                                                                                                            ('Kenworth W900', 8, 'DIESEL', 400.0, 25000.0, 23000.0, 10, 'Laura García'),
                                                                                                                                            ('Peterbilt 379', 9, 'DIESEL', 370.0, 24000.0, 22000.0, 10, 'David Sánchez'),
                                                                                                                                            ('Freightliner Cascadia', 10, 'DIESEL', 390.0, 26000.0, 24000.0, 10, 'Sara Ramírez');
