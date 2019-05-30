#!/usr/bin/env bash
/c/kafka/kafka_2.12-2.2.0/bin/kafka-topics.sh --create --bootstrap-server localhost:9092 --replication-factor 1 --partitions 4 --topic multiple-partition-1kb
/c/kafka/kafka_2.12-2.2.0/bin/kafka-topics.sh --create --bootstrap-server localhost:9092 --replication-factor 1 --partitions 4 --topic multiple-partition-100kb
/c/kafka/kafka_2.12-2.2.0/bin/kafka-topics.sh --create --bootstrap-server localhost:9092 --replication-factor 1 --partitions 4 --topic multiple-partition-1Mb
/c/kafka/kafka_2.12-2.2.0/bin/kafka-topics.sh --create --bootstrap-server localhost:9092 --replication-factor 1 --partitions 4 --topic multiple-partition-10Mb
/c/kafka/kafka_2.12-2.2.0/bin/kafka-topics.sh --create --bootstrap-server localhost:9092 --replication-factor 1 --partitions 4 --topic multiple-partition-100Mb
/c/kafka/kafka_2.12-2.2.0/bin/kafka-topics.sh --create --bootstrap-server localhost:9092 --replication-factor 1 --partitions 4 --topic multiple-partition-1Gb
/c/kafka/kafka_2.12-2.2.0/bin/kafka-topics.sh --create --bootstrap-server localhost:9092 --replication-factor 1 --partitions 4 --topic multiple-partition-growing