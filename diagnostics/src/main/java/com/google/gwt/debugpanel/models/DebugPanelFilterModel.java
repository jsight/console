/*
 * Copyright 2009 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy
 * of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package com.google.gwt.debugpanel.models;

/**
 * A model for the list of filters displayed and applied on the debug panel.
 */
public interface DebugPanelFilterModel {
  public int getCountOfAvailableFilters();
  public DebugPanelFilter getFilter(int idx);

  public boolean isFilterActive(int idx);
  public void setFilterActive(int idx, boolean active);

  public DebugPanelFilter.Config getFilterConfig(int idx);

  public void addListener(DebugPanelFilterModelListener listener);
  public void removeListener(DebugPanelFilterModelListener listener);
}
