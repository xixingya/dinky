/*
 *
 *   Licensed to the Apache Software Foundation (ASF) under one or more
 *   contributor license agreements.  See the NOTICE file distributed with
 *   this work for additional information regarding copyright ownership.
 *   The ASF licenses this file to You under the Apache License, Version 2.0
 *   (the "License"); you may not use this file except in compliance with
 *   the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 */

import React from "react";
import {ProCard, StatisticCard} from "@ant-design/pro-components";
import CountFormatter from "@/components/CountFormatter";
import {BatchJobIcon, StreamingJobIcon} from "@/components/Icons/HomeIcon";
import {imgStyle} from "@/pages/Home/constants";
import {l} from "@/utils/intl";

export const BatchStreamProportion: React.FC = () => {

  return <ProCard split={'vertical'} size={'small'}>
    <StatisticCard.Group bodyStyle={{alignContent:'center'}}>
      <StatisticCard
          statistic={{
            title: l('home.job.batch'),
            value: 11,
            suffix: l('global.item'),
            icon: <BatchJobIcon style={imgStyle}/>,
            formatter: (value)=> <CountFormatter value={Number(value)}/>
          }}
      />
        <StatisticCard.Divider/>
      <StatisticCard
          statistic={{
            title: l('home.job.stream'),
            value: 233,
            suffix: l('global.item'),
            icon: <StreamingJobIcon style={imgStyle}/>,
            formatter: (value)=> <CountFormatter value={Number(value)}/>
          }}
      />
    </StatisticCard.Group>
  </ProCard>;
}

export default BatchStreamProportion;