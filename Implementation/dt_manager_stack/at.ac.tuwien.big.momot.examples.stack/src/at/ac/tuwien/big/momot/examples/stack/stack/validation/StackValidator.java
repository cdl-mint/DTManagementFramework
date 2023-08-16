/**
 *
 * $Id$
 */
package at.ac.tuwien.big.momot.examples.stack.stack.validation;

import at.ac.tuwien.big.momot.examples.stack.stack.Stack;

/**
 * A sample validator interface for {@link at.ac.tuwien.big.momot.examples.stack.stack.Stack}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface StackValidator {
	boolean validate();

	boolean validateId(String value);
	boolean validateLoad(int value);
	boolean validateLeft(Stack value);
	boolean validateRight(Stack value);
}
