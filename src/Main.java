public class Main {
    public static void main(String[] args) {
       var dog = 8.0;
       System.out.println(dog);
       dog = dog + 4;
        System.out.println(dog);
        dog = dog - 3.5;
        System.out.println(dog);
       var cat = 3.6;
       System.out.println(cat);
       cat = cat + 4;
        System.out.println(cat);
        cat = cat - 1.6;
        System.out.println(cat);
       var paper = 763789;
        System.out.println(paper);
        paper = paper + 4;
        System.out.println(paper);
        paper = paper - 7639;
        System.out.println(paper);
        var friend = 19;

        System.out.println(friend);
        friend = (friend + 2) / 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog = ((frog * 10) / 3.5) + 4;
        System.out.println(frog);

        var weightFirstBoxer = 78.2;
        var weightSecondBoxer = 82.7;
        var totalWeightTwoBoxers = weightFirstBoxer + weightSecondBoxer;
        System.out.println(totalWeightTwoBoxers);
        var differenceWeightTwoBoxers = weightSecondBoxer - weightFirstBoxer;
        System.out.println(differenceWeightTwoBoxers);
        var remainderDivisionBetweenTwoWeights = weightSecondBoxer % weightFirstBoxer;
        System.out.println(remainderDivisionBetweenTwoWeights);
        System.out.println();

        var totalNumberHoursOfEmployees = 640;
        var hoursOfOneEmployee = 8;
        var numbeOfCompanyEmployees = totalNumberHoursOfEmployees / hoursOfOneEmployee;
        System.out.println("Всего работников в компании - " +numbeOfCompanyEmployees+ " человек");
        var moreEmployees = numbeOfCompanyEmployees + 94;
        var hoursDividedBetweenEmployees = totalNumberHoursOfEmployees / moreEmployees;
        System.out.println("Если в компании работает " + moreEmployees + " человеке, то всего " +  hoursDividedBetweenEmployees + " часа работы могут быть поделены между сотрудниками");
    }
}