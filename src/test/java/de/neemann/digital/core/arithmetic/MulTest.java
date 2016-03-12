package de.neemann.digital.core.arithmetic;

import de.neemann.digital.TestExecuter;
import de.neemann.digital.core.Model;
import de.neemann.digital.core.ObservableValue;
import junit.framework.TestCase;

/**
 * @author hneemann
 */
public class MulTest extends TestCase {
    public void testMul() throws Exception {
        ObservableValue a = new ObservableValue(4);
        ObservableValue b = new ObservableValue(4);


        Model model = new Model();
        Mul node = new Mul(a, b);
        model.add(node);

        TestExecuter sc = new TestExecuter(model).setInputs(a, b).setOutputs(node.getMul());
        sc.check(0, 0, 0);
        sc.check(6, 6, 36);
        sc.check(15, 15, 225);
    }
}