/*
 * Copyright (c) 2016 LARUS Business Automation [http://www.larus-ba.it]
 * <p>
 * This file is part of the "LARUS Integration Framework for Neo4j".
 * <p>
 * The "LARUS Integration Framework for Neo4j" is licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * <p>
 * Created on 24/03/16
 */
package org.neo4j.jdbc.bolt;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.powermock.api.mockito.PowerMockito.mock;

/**
 * @author AgileLARUS
 * @since 3.0.0
 */
public class BoltNeo4jParameterMetaDataTest {

	BoltNeo4jParameterMetaData boltParameterMetaData;

	@Rule public ExpectedException expectedEx = ExpectedException.none();

	@Before public void setUp() {
		BoltNeo4jPreparedStatement preparedStatement = mock(BoltNeo4jPreparedStatement.class);
		boltParameterMetaData = new BoltNeo4jParameterMetaData(preparedStatement);
	}

	@Test public void isLoggableTest() {
		assertFalse(boltParameterMetaData.isLoggable());
	}

	@Test public void setLoggableTest() {
		assertFalse(boltParameterMetaData.isLoggable());
		boltParameterMetaData.setLoggable(true);
		assertTrue(boltParameterMetaData.isLoggable());
		boltParameterMetaData.setLoggable(false);
		assertFalse(boltParameterMetaData.isLoggable());
	}

}