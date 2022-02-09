package ObjectParameter;

//passing reference type (ADDRESS)

class Test {
    String testName;
    float score;

    Test(String n, float s) {
        testName = n;
        score = s;
    }

    void display() {
        System.out.println("testName : " + testName + "; Score : " + score);
    }
}

public class ObjPassingAsParameter {
    public static void main(String[] args)
    {
        Test t = new Test("CT1", 10);
        t.display();

        updateScore(t, 15.0f);
        System.out.println("After update :");
        t.display();
    }

    //test variable : reference type; newScore variable : float type
    static void updateScore(Test test, float newScore) {
        //address of 't' will be placed at Test test because it's a reference type variable
        test.score = newScore;
    }
}
