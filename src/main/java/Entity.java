public class Entity {
    @Secured(intValue = 1)
    public void doSomething(){

    }

    @Secured(intValue = 2, stringValue = "dsasda")
    private void getSomething(){

    }

    public void getSomethingTwo(){

    }

    @Deprecated
    @Secured(intValue = 0, stringValue = "asdsdqweqwe")
    private void deprecatedMethod(){

    }
}
