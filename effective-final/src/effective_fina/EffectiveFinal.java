package effective_fina;
/**
 * Effective final,
 * A variable that only initialize once it created is called effective final
 * if it's value change after initialize, it's not consider effective final anymore.
 *
 * such lamda, anonymous class need it to be effective final
 * why? no understand ..., need to be deeper...
 */

public class EffectiveFinal {
    static  int __int;
    public static void main(String[] args) {
        var I_am_Effective_Final="It will work tho";
        FuncInterface I_am_Effective_Final_impl =(() -> {
            System.out.println("I am accessing outer scope value: "+ I_am_Effective_Final);
        });
        I_am_Effective_Final_impl.doSth();
//      ------------------------------------
//      ------------------------------------

        var I_am_not_Effective_Final="It wont work tho";
        I_am_not_Effective_Final="This will give error below hahahaha";

        var nah_this_work=I_am_not_Effective_Final +", nope, this work here";
        FuncInterface I_am_not_Effective_Final_impl =(() -> {
            System.out.println("I am accessing outer scope value: "+ nah_this_work);
        });
        I_am_not_Effective_Final_impl.doSth();

//        ---------
//        ---------
        var I_am_not_Effective_Final__v2="It wont work tho";
//        I_am_not_Effective_Final__v2="This will give error below hahahaha";
//        
        FuncInterface I_am_not_Effective_Final_v2_impl =(() -> {
            System.out.println("I am accessing outer scope value: "+ I_am_not_Effective_Final__v2);
        });
        I_am_not_Effective_Final_impl.doSth();




    }



}
