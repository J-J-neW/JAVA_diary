package N8_extendsApplication;

public class Z extends F{
    public String skill;

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public void printInfo(){
        System.out.println(getName() + "老师的技能是：" + getSkill());
    }
}
