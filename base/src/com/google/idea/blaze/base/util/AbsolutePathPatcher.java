/*
 * Copyright 2020 The Bazel Authors. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.idea.blaze.base.util;

import com.intellij.openapi.extensions.ExtensionPointName;
import com.intellij.openapi.vfs.VirtualFile;
import java.io.File;
import javax.annotation.Nullable;

/** Helper to fix absolute paths */
public interface AbsolutePathPatcher {
  ExtensionPointName<AbsolutePathPatcher> EP_NAME =
      ExtensionPointName.create("com.google.idea.blaze.AbsolutePathPatcher");

  /** update the line */
  String fixAllPaths(String line);

  /** update virtualFile path */
  @Nullable
  VirtualFile fixAllPaths(@Nullable VirtualFile virtualFile, boolean refreshIfNeeded);

  /** update file path */
  File fixAllPaths(File file);
}
