package org.apache.maven.plugins.enforcer;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

import java.util.Set;

import org.apache.maven.artifact.Artifact;
import org.apache.maven.enforcer.rule.api.EnforcerRuleException;
import org.apache.maven.plugin.logging.Log;

/**
 * This rule is deprecated. Use requireReleaseVersions.
 *
 * @author <a href="mailto:brianf@apache.org">Brian Fox</a>
 * @version $Id$
 * @deprecated replaced by {@link RequireReleaseDeps}
 */
public class NoSnapshots
    extends AbstractBanDependencies
{

    /**
     * {@inheritDoc}
     */
    protected Set<Artifact> checkDependencies( Set<Artifact> dependencies, Log log )
        throws EnforcerRuleException
    {
        log.warn( "The \"NoSnapshots\" rule is deprecated. Use \"requireReleaseDeps\" instead" );
        RequireReleaseDeps rule = new RequireReleaseDeps();
        return rule.checkDependencies( dependencies, log );
    }
}
