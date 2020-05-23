package CodingNomads.examples.generics.demo;

//simple POJO with one instance variable

public class GenericClass<Y, Z> { //data type is Z

    private Y yval;
    private Z zval1; //instance variable

    //getter & setter
    public Z getZval1() {
        return zval1;
    }
    public void setZval1(Z zval1) {
        this.zval1 = zval1;
    }
}

/*
When this class is called in the the other class and the Z is replaced by a type,
the byte code never sees the Z, just the other type which replaces everywhere there is a Z.
 */
