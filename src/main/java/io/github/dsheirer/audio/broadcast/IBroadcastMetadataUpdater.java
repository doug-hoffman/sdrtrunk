/*******************************************************************************
 * sdrtrunk
 * Copyright (C) 2014-2017 Dennis Sheirer
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 *
 ******************************************************************************/
package io.github.dsheirer.audio.broadcast;

import io.github.dsheirer.identifier.IdentifierCollection;

public interface IBroadcastMetadataUpdater
{
    /**
     * Updates broadcast audio metadata
     *
     * @param identifierCollection containing metadata attributes
     * @param startTime containing recording start time as MS since epoch
     */
    void update(IdentifierCollection identifierCollection, long startTime);
}
