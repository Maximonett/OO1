
protoCuenta = {
    saldo : 0,

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

    // Al usar esta sintáxis para definir los métodos, no puedo utilizar super
    extraer : function(monto) {
        if (monto < this.saldo) {
            this.saldo = this.saldo - monto;
            return true;
        } else { 
            return false; 
        }
    }
};



