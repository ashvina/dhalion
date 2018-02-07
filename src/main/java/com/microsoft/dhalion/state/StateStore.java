/*
 * Copyright (c) Microsoft Corporation. All rights reserved.
 *
 * This program is made available under the terms of the MIT License.
 * See the LICENSE file in the project root for more information.
 */

package com.microsoft.dhalion.state;

import com.microsoft.dhalion.core.Action;
import com.microsoft.dhalion.core.Diagnosis;
import com.microsoft.dhalion.core.Measurement;
import com.microsoft.dhalion.core.MeasurementsArray;
import com.microsoft.dhalion.core.Symptom;

import java.time.Duration;
import java.time.Instant;
import java.util.Collection;

public class StateStore {
  private final MeasurementsArray measurementsArray;

  public StateStore(MeasurementsArray measurementsArray) {
    this.measurementsArray = measurementsArray;
  }

  public MeasurementsArray getMeasurements() {
    return null;
  }

  public Collection<Symptom> getSymtoms(Instant startTime, Duration duration, String... symtoms) {
    return null;
  }

  public Collection<Diagnosis> getDiagnosis(Instant startTime, Duration duration, String... diagnosisTypes) {
    return null;
  }

  public Collection<Action> getActions(Instant startTime, Duration duration, String... actions) {
    return null;
  }
}