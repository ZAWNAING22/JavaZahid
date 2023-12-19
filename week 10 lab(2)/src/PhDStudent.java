public class PhDStudent extends MasterStudent implements ArticleScoreBehaviour{
    int numberOfArticles;
    public PhDStudent(int id, float mid, float fin, int conf,int nconf, int numberofArticles)
    {
        super(id,mid,fin,nconf);
        this.numberOfArticles= numberOfArticles;

    }
    @Override
    float computeTotalScore()
    {
        return super.computeTotalScore()+artcleScore();
    }

    @Override
    public float artcleScore()
    {
    return numberOfArticles*8;
    }


}
