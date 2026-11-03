protoCuenta = {
    saldo : 0,

    // Estos métodos están definidos con la antigua sintaxis de funciones
    // que podría traer dificultades en el binding the this/super
    getSaldo : function() {
        return this.saldo;
    },

    depositar : function(monto) {
        this.saldo = this.saldo + monto;
        return true;
    },

    extraer : function(monto) {
        this.saldo = this.saldo - monto;
        return true;
    }

};

protoCajaDeAhorro = {

    __proto__ : protoCuenta,

    // Estos métodos están definidos con la sintáxis de ES6 
    extraer (monto) {
        if (monto < this.saldo) {
           super.extraer(monto)
            return true;
        } else { 
            return false; 
        }
    }
};



