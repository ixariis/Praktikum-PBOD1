public abstract class Animal {
    
    public abstract void Eat();

    public String toString(){
        return this.getClass().getSimpleName();
    }
}
