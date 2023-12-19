public class BachelorStudent extends Student implements ProjectScoreBehaviour{
    public BachelorStudent(int id, float mid , float fin)
    {
        super(id,mid,fin);
    }

    float computeTotalScore(){
        return computeBaseScore()+projectScore();

    }
    float computeBaseScore(){
        return getMid()*0.4f+ getFin()*0.6f;

    }
    @Override
    public float projectScore(){
        return 20f;

    }
}
