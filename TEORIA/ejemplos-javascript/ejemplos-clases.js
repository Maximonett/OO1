class Cuenta {

    constructor() {
        this.saldo = 0; 
    }

    getSaldo() {
        return this.saldo;
    };

    depositar(monto) {
        this.saldo = this.saldo + monto;
    };

    extraer(monto) {
        this.saldo = this.saldo - monto;
    };

};

class CajaDeAhorro extends Cuenta {

    extraer(monto) {
        if (monto < this.saldo) {
            super.extraer(monto);
        }
    }
};



