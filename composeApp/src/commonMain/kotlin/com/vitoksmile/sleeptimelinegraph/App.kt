package com.vitoksmile.sleeptimelinegraph

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.datetime.Instant
import kotlinx.datetime.UtcOffset
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    MaterialTheme {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
        ) {
            val record = remember {
                SleepSessionRecord(
                    startTime = Instant.parse("2025-01-28T21:10:10Z"),
                    endTime = Instant.parse("2025-01-29T07:32:13Z"),
                    startZoneOffset = UtcOffset(hours = 2),
                    endZoneOffset = UtcOffset(hours = 2),
                    stages = listOf(
                        SleepSessionRecord.Stage(
                            startTime = Instant.parse("2025-01-28T21:10:10Z"),
                            endTime = Instant.parse("2025-01-28T23:15:13Z"),
                            type = SleepSessionStageType.Light,
                        ),
                        SleepSessionRecord.Stage(
                            startTime = Instant.parse("2025-01-28T23:15:13Z"),
                            endTime = Instant.parse("2025-01-29T01:56:32Z"),
                            type = SleepSessionStageType.Deep,
                        ),
                        SleepSessionRecord.Stage(
                            startTime = Instant.parse("2025-01-29T01:56:13Z"),
                            endTime = Instant.parse("2025-01-29T03:16:22Z"),
                            type = SleepSessionStageType.Light,
                        ),
                        SleepSessionRecord.Stage(
                            startTime = Instant.parse("2025-01-29T03:16:22Z"),
                            endTime = Instant.parse("2025-01-29T04:32:13Z"),
                            type = SleepSessionStageType.REM,
                        ),
                        SleepSessionRecord.Stage(
                            startTime = Instant.parse("2025-01-29T04:32:13Z"),
                            endTime = Instant.parse("2025-01-29T05:12:56Z"),
                            type = SleepSessionStageType.Deep,
                        ),
                        SleepSessionRecord.Stage(
                            startTime = Instant.parse("2025-01-29T05:12:56Z"),
                            endTime = Instant.parse("2025-01-29T07:32:13Z"),
                            type = SleepSessionStageType.Light,
                        ),
                        SleepSessionRecord.Stage(
                            startTime = Instant.parse("2025-01-28T22:11:56Z"),
                            endTime = Instant.parse("2025-01-28T22:17:13Z"),
                            type = SleepSessionStageType.Awake,
                        ),
                        SleepSessionRecord.Stage(
                            startTime = Instant.parse("2025-01-28T22:39:56Z"),
                            endTime = Instant.parse("2025-01-28T22:51:13Z"),
                            type = SleepSessionStageType.Awake,
                        ),
                        SleepSessionRecord.Stage(
                            startTime = Instant.parse("2025-01-29T04:47:56Z"),
                            endTime = Instant.parse("2025-01-29T04:54:13Z"),
                            type = SleepSessionStageType.Awake,
                        ),
                    ),
                )
            }

            SleepSessionCanvas(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                record = record,
                typeTextStyle = TextStyle(
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black,
                ),
                timeTextStyle = TextStyle(
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Normal,
                    color = Color.Black,
                ),
            )
        }
    }
}