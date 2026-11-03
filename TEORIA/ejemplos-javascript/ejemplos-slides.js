batman = {
    nombre : "Juan Carlos",
    apellido : "Batman",
    direccion : "Baticueva - C. Gótica",

    getNombreCompleto() {
        return this.nombre + ' ' + this.apellido;
    }
};

batman.nombre; // 'Juan Carlos'

batman.getNombreCompleto(); // 'Juan Carlos Batman'

robin = {};
robin.__proto__ = batman;
robin.nombre = 'Ricardo';
robin.getNombreCompleto(); // 'Ricardo Batman';

batichica = Object.create(batman);
batichica.direccion = 'Metrópolis';


