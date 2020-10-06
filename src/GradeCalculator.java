public class GradeCalculator {
    private String name;
    private double initial_grade;
    private double pre_grade;
    private int pre_credit;
    private double invert_grade;
    private int initial_credit;
    private double this_credit = 0;
    private double this_grade = 0;
    private double this_grad_cred;
    private double add_this_grad_cred = 0;
    private double avg_this_grad_cred;
    private double all_credit = 0;


    public GradeCalculator(String name, double pre_grade, int pre_credit){
        this.name = name;
        // 점수(grade)
        this.pre_grade = pre_grade;
        // 학점(credit)
        this.pre_credit = pre_credit;

        // 직전 점수
        initial_grade = pre_grade;
        // 직전 학점
        initial_credit = pre_credit;
    }
    // 과목명, 학점, 성적 받아서 추가하기
    public void addCourse(Course course){
        pre_grade = pre_grade + course.sort_grade;
        // 이번 학기 학점 계산
        this_credit = course.sort_grade + this_credit;

        // 영문식 점수 -> 숫자식 점수로 변환
        if (course.credit.equals("A+")){
            invert_grade = 4.5;
        }else if(course.credit.equals("A")){
            invert_grade = 4.0;
        }else if(course.credit.equals("B+")){
            invert_grade = 3.5;
        }else if(course.credit.equals("B")){
            invert_grade = 3.0;
        }else {
            invert_grade = 2.5;
        }

        // 이번학기 성적 전부 더하기
        this_grade = this_grade + invert_grade;
        // 입력한 학점 * 입력한 성적
        this_grad_cred = course.sort_grade * invert_grade;

//        System.out.print(course.sort_grade + "  ");
//        System.out.print(initial_grade + " ");
//        System.out.println(this_grad_cred);

        add_this_grad_cred = this_grad_cred + add_this_grad_cred;
    }
    public void print(){
        //이번 학기 평균 성적 내기
        avg_this_grad_cred = add_this_grad_cred / this_credit;

        System.out.println("직전 학기 성적: " + initial_grade + "(총 " + initial_credit + "학점)");
        System.out.println("이번 학기 성적: " + Math.round(avg_this_grad_cred*10000000000.0)/10000000000.0 + "(총 " + this_credit + "학점)");
        System.out.println("전체 예상 학점: " + );
    }
}
