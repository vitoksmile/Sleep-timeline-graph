package com.vitoksmile.sleeptimelinegraph

import kotlinx.datetime.Instant
import kotlinx.datetime.UtcOffset

data class SleepSessionRecord(
    val startTime: Instant,
    val startZoneOffset: UtcOffset,
    val endTime: Instant,
    val endZoneOffset: UtcOffset,
    val stages: List<Stage>,
) {

    data class Stage(
        val startTime: Instant,
        val endTime: Instant,
        val type: SleepSessionStageType,
    )
}

enum class SleepSessionStageType {
    Awake,
    Light,
    Deep,
    REM,
}
