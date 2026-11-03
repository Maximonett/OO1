const parentA = { 
    m1() { 
        console.log('m1-A');
        this.m2();
    }, 
};

const parentB = { 
    m1() { 
        console.log('m1-B');
        this.m2();
    }, 
};

const child = {
    m1() {
        super.m1();
    },

    m2() {
        console.log('m2')
    },
};

Object.setPrototypeOf(child, parentA);
child.m1(); // Logs "1"

Object.setPrototypeOf(child, parentB);
child.m1(); // Logs "2"
