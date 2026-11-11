class GrantParents{
    void name() {
        system.out.println("This is parent");
    }
}
class parent extends GrantParents{
    parent(){
        system.out.println("This is child1");
    }
}
class child extends parent{
    child(){
        system.out.println("This is child");
    }
}
class Main{
    public static void main(String[]args){
            child ch=new child();
            ch.name();
        }
    }