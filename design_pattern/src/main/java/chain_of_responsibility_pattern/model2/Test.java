package chain_of_responsibility_pattern.model2;


/**
 * 1. 改变内部的传递规则
 * 在内部，项目经理完全可以跳过人事部到那一关直接找到总经理。
 * 每个人都可以去动态地指定他的继任者。
 * 2. 可以从职责链任何一关开始。
 * 如果项目经理不在，可以直接去找部门经理，责任链还会继续，没有影响。
 * 3.用与不用的区别
 * 不用职责链的结构，我们需要和公司中的每一个层级都发生耦合关系。
 * 如果反映在代码上即使我们需要在一个类中去写上很多丑陋的if….else语句。
 * 如果用了职责链，相当于我们面对的是一个黑箱，我们只需要认识其中的一个部门，然后让黑箱内部去负责传递就好了
 */
public class Test {
    public static void main(String[] args) {
        //先要组装责任链
        Handler h1 = new GeneralManager();
        Handler h2 = new DeptManager();
        Handler h3 = new ProjectManager();
        h3.setSuccessor(h2);
        h2.setSuccessor(h1);

        //开始测试
        String test1 = h3.handleFeeRequest("张三", 300);
        System.out.println("test1 = " + test1);
        String test2 = h3.handleFeeRequest("李四", 300);
        System.out.println("test2 = " + test2);
        System.out.println("---------------------------------------");

        String test3 = h3.handleFeeRequest("张三", 700);
        System.out.println("test3 = " + test3);
        String test4 = h3.handleFeeRequest("李四", 700);
        System.out.println("test4 = " + test4);
        System.out.println("---------------------------------------");

        String test5 = h3.handleFeeRequest("张三", 1500);
        System.out.println("test5 = " + test5);
        String test6 = h3.handleFeeRequest("李四", 1500);
        System.out.println("test6 = " + test6);
    }
}
