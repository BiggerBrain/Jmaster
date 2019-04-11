package mediator_pattern.easy_model1;

/**
 * Created by dell on 2017/11/14.
 */
class ColleagueB extends AbstractColleague {

    public void setNumber(int number, AbstractColleague coll) {
        this.number = number;
        coll.setNumber(number / 100);
    }
}
