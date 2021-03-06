/**
 * Copyright (c) 2014,2018 Contributors to the Eclipse Foundation
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.smarthome.io.rest.sitemap.internal;

/**
 * Event to notify the browser that the sitemap has been changed
 *
 * @author Laurent Garnier - Initial Contribution
 *
 */
public class ServerAliveEvent extends SitemapEvent {
    public final String TYPE = "ALIVE";
}
