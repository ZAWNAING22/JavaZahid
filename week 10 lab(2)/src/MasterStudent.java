public class MasterStudent extends Student implements ConferenceScoreBehaviour{
    int Numberofconference;
    MasterStudent(int id, float mid, float fin,int numberofconference)
    {
        super(id,mid,fin);
        this.Numberofconference= numberofconference;
    }
     float computeTotalScore()
     {
         return computeBaseScore()+conferenceScore();

     }

     float computeBaseScore()
     {
        return getMid()*0.4f+getFin()*0.6f;

     }
    
    //from interfaces
    @Override
    public float conferenceScore()
    {
        return Numberofconference*5;

    }
}
