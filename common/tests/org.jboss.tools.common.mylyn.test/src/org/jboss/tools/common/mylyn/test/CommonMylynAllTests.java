/******************************************************************************* 
 * Copyright (c) 2011 Red Hat, Inc. 
 * Distributed under license by Red Hat, Inc. All rights reserved. 
 * This program is made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, 
 * and is available at http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 * Red Hat, Inc. - initial API and implementation 
 ******************************************************************************/ 
package org.jboss.tools.common.mylyn.test;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * @author Alexey Kazakov
 */
public class CommonMylynAllTests {

	public static Test suite() {
		TestSuite suiteAll = new TestSuite("Common Mylyn Tests");
		suiteAll.addTestSuite(RepositoryTest.class);
		return suiteAll;
	}
}