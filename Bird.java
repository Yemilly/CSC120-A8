
public class Bird implements Contract{
    public String name;
    public boolean moving;
    public int size;

    /** Bird class
     * @param name
     */
    public Bird (String name){
        this.name=name;
        this.moving=true;
        this.size=5;


    }

    
    public void grab(String item){
        System.out.println(this.name + " grabbed the " + item);

        }
    


    public String drop(String item){
        System.out.println(this.name + " dropped the " + item);
        return item;

    }
    
    public void examine(String item){
        System.out.println(this.name + " is examining the " + item);
    
       }


    public void use(String item){
        System.out.println(this.name + " is eating the " + item);

        }


    
    public boolean walk(String direction){
        if(this.moving==true){
            System.out.println(this.name + " is walking " + direction);
            return this.moving=true;


        }else{
            System.out.println(this.name + " is not walking" + direction);
            this.moving=false;
            return this.moving=false;

        }
        


    }

    public void fly(){
        System.out.println(this.name + " can't fly " );
           

    }
    
    //public boolean fly(int x, int y){
        //if(this.moving==true){
            //System.out.println(this.name + "is flying" + fly(0, 0));
            //return this.moving=true;


       // }else{
           // System.out.println(this.name + " is not flying" + fly(0, 0));
           // this.moving=false;
           // return this.moving=false;

        //}
   // }


    public Number shrink(){
        if(this.size <5){
            System.out.println(this.name + " has shrunk!!! ");
            return this.size;


        }else{
            System.out.println(this.name + " is normal size ");
            return this.size;


        }


    }
    public Number grow(){
        if(this.size >5){
            System.out.println(this.name + " has grown!!! ");
            return this.size;


        }else{
            System.out.println(this.name + " is normal size ");
            return this.size;
            

        }

    }
    public void rest(){
        System.out.println(this.name + " is resting !");

    }


    
    public void undo(){
        System.out.println(this.name + " can't undo! ");

    }

    public static void main(String[] args){
        Bird birdie= new Bird("birdie");
        birdie.grab("candy");
        birdie.drop("candy");
        birdie.examine("candy");
        birdie.use("candy");
        birdie.walk("to get candy");
        birdie.fly();
        birdie.shrink();
        birdie.grow();
        birdie.rest();
        birdie.undo();


    }

}
    
