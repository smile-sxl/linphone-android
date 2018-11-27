package org.linphone.chat;

/*
 ChatMessagesGenericAdapter.java
 Copyright (C) 2018  Belledonne Communications, Grenoble, France

 This program is free software; you can redistribute it and/or
 modify it under the terms of the GNU General Public License
 as published by the Free Software Foundation; either version 2
 of the License, or (at your option) any later version.

 This program is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with this program; if not, write to the Free Software
 Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */

import org.linphone.contacts.LinphoneContact;
import org.linphone.core.EventLog;

import java.util.ArrayList;

public interface ChatMessagesGenericAdapter {
    void addToHistory(EventLog log);

    void addAllToHistory(ArrayList<EventLog> logs);

    void setContacts(ArrayList<LinphoneContact> participants);

    void refresh(EventLog[] history);

    void clear();

    Object getItem(int i);

    void removeItem(int i);
}