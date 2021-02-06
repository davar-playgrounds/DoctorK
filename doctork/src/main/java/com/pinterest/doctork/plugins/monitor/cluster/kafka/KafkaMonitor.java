package com.pinterest.doctork.plugins.monitor.cluster.kafka;

import com.pinterest.doctork.plugins.context.state.cluster.ClusterState;
import com.pinterest.doctork.plugins.context.state.cluster.kafka.KafkaState;
import com.pinterest.doctork.plugins.monitor.cluster.ClusterMonitor;

public abstract class KafkaMonitor extends ClusterMonitor {
  @Override
  public final ClusterState observe(ClusterState state) throws Exception{
    if (state instanceof KafkaState){
      return observe((KafkaState) state);
    }
    return null;
  }
  public abstract KafkaState observe(KafkaState state) throws Exception;
}
