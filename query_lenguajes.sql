-- Crear la base de datos
CREATE DATABASE IF NOT EXISTS restaurante;
USE restaurante;

-- Tabla cargo
CREATE TABLE IF NOT EXISTS cargo (
    CargoID INT PRIMARY KEY AUTO_INCREMENT,
    Descripcion VARCHAR(30)
);

-- Tabla empleado
CREATE TABLE IF NOT EXISTS empleado (
    EmpleadoID INT PRIMARY KEY AUTO_INCREMENT,
    PNombre VARCHAR(25),
    SNombre VARCHAR(25),
    PApellido VARCHAR(25),
    SApellido VARCHAR(25),
    CargoID INT,
    Sueldo DECIMAL(10, 2),
    FOREIGN KEY (CargoID) REFERENCES cargo(CargoID)
);

-- Tabla cliente
CREATE TABLE IF NOT EXISTS cliente (
    ClienteID INT PRIMARY KEY AUTO_INCREMENT,
    PNombre VARCHAR(25),
    SNombre VARCHAR(25),
    PApellido VARCHAR(25),
    SApellido VARCHAR(25)
);

-- Tabla forma_pago
CREATE TABLE IF NOT EXISTS forma_pago (
    FormaPagoID INT PRIMARY KEY AUTO_INCREMENT,
    Descripcion VARCHAR(30)
);

-- Tabla orden
CREATE TABLE IF NOT EXISTS orden (
    OrdenID INT PRIMARY KEY AUTO_INCREMENT,
    ClienteID INT,
    MeseroID INT,
    CajeroID INT,
    fechaOrden DATE,
    FOREIGN KEY (ClienteID) REFERENCES cliente(ClienteID),
    FOREIGN KEY (MeseroID) REFERENCES empleado(EmpleadoID),
    FOREIGN KEY (CajeroID) REFERENCES empleado(EmpleadoID)
);

-- Tabla detalleOrden
CREATE TABLE IF NOT EXISTS detalleOrden (
    OrdenID INT,
    ProductoID INT,
    Cantidad INT,
    PRIMARY KEY (OrdenID, ProductoID),
    FOREIGN KEY (OrdenID) REFERENCES orden(OrdenID),
    FOREIGN KEY (ProductoID) REFERENCES producto(ProductoID)
);

-- Tabla factura
CREATE TABLE IF NOT EXISTS factura (
    FacturaID INT PRIMARY KEY AUTO_INCREMENT,
    OrdenID INT,
    Total DECIMAL(10, 2),
    Descuento DECIMAL(5, 2),
    IVA DECIMAL(5, 2),
    Subtotal DECIMAL(10, 2),
    FormaPagoID INT,
    FechaPago DATE,
    FOREIGN KEY (OrdenID) REFERENCES orden(OrdenID),
    FOREIGN KEY (FormaPagoID) REFERENCES forma_pago(FormaPagoID)
);

-- Tabla proveedor
CREATE TABLE IF NOT EXISTS proveedor (
    ProveedorID INT PRIMARY KEY AUTO_INCREMENT,
    NombreProveedor VARCHAR(35),
    Telefono VARCHAR(20),
    Correo VARCHAR(50)
);

-- Tabla producto
CREATE TABLE IF NOT EXISTS producto (
    ProductoID INT PRIMARY KEY AUTO_INCREMENT,
    NombreProducto VARCHAR(80),
    Precio DECIMAL(10, 2),
    ProveedorID INT,
    FOREIGN KEY (ProveedorID) REFERENCES proveedor(ProveedorID)
);

-- Tabla ingrediente
CREATE TABLE IF NOT EXISTS ingrediente (
    IngredienteID INT PRIMARY KEY AUTO_INCREMENT,
    NombreIngrediente VARCHAR(40),
    PrecioIngredienteXUnidad DECIMAL(10, 2),
    DescripcionUnidad VARCHAR(50), --Si es por kg, unidades, gramos, etc.
    CantidadAlmacen DECIMAL(10, 2), --Cantidad de unidades
    StockMinimo DECIMAL(10, 2) --Para saber cuando el restaurante tiene que comprar mas
);

-- Tabla productoIngrediente
CREATE TABLE IF NOT EXISTS productoIngrediente (
    ProductoID INT,
    IngredienteID INT,
    CantidadUnidades DECIMAL(10, 2),
    PRIMARY KEY (ProductoID, IngredienteID),
    FOREIGN KEY (ProductoID) REFERENCES producto(ProductoID),
    FOREIGN KEY (IngredienteID) REFERENCES ingrediente(IngredienteID)
);

-- Tabla compra
CREATE TABLE IF NOT EXISTS compra (
    CompraID INT PRIMARY KEY AUTO_INCREMENT,
    Subtotal DECIMAL(10, 2),
    Total DECIMAL(10, 2),
    Descuento DECIMAL(5, 2)
);

-- Tabla detalleCompra
CREATE TABLE IF NOT EXISTS detalleCompra (
    CompraID INT,
    ProductoID INT,
    Cantidad INT,
    ProveedorID INT,
    PRIMARY KEY (CompraID, ProductoID),
    FOREIGN KEY (CompraID) REFERENCES compra(CompraID),
    FOREIGN KEY (ProductoID) REFERENCES producto(ProductoID),
    FOREIGN KEY (ProveedorID) REFERENCES proveedor(ProveedorID)
);