for (i=11; i<=20; i++)
job("seedJobExtraTask-$i")
{
  steps{
    shell('echo $JOB_NAME $BUILD_NUMBER')
  }
}
