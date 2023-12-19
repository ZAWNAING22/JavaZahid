public abstract class Student {
     private int id;
    private float mid;
   private float fin;
// getterrrrrrrr
    public int getId() {
        return id;
    }

    public float getMid() {
        return mid;
    }

    public float getFin() {
        return fin;
    }

    public  Student(int id, float mid , float fin)
   {
       this.id= id;
       this.mid= mid;
       this.fin= fin;
   }
   abstract float computeTotalScore();

  abstract float computeBaseScore();

}

