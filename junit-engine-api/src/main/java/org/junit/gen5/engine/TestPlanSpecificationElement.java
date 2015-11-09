/*
 * Copyright 2015 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution and is available at
 *
 * http://www.eclipse.org/legal/epl-v10.html
 */

package org.junit.gen5.engine;

public interface TestPlanSpecificationElement {

	interface Visitor {

		default void visitClassNameSpecification(String className) {
		}

		default void visitUniqueIdSpecification(String uniqueId) {
		}

		default void visitPackageSpecification(String packageName) {
		}
	}

	void accept(Visitor visitor);
}