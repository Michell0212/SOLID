class Motor {
    private DVehiculo vehiculo;
    public Motor(DVehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    // acciona el motor y mueve el vehículo
    public void accionar() {
        // Llama al método mover del vehículo
        vehiculo.mover();
    }
}