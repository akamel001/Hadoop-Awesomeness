package step2;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.input.TextInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.mapreduce.lib.output.TextOutputFormat;

import test.Util;

public class Step2 {
    public static void main(final String[] args) throws Exception {
        final Configuration conf = new Configuration();

        final Job job = new Job(conf, "Step2");
        job.setJarByClass(Step2.class);

        job.setOutputKeyClass(IntWritable.class);
        job.setOutputValueClass(IntWritable.class);

        job.setMapperClass(Map2.class);
        job.setReducerClass(Reducer2.class);

        job.setInputFormatClass(TextInputFormat.class);
        job.setOutputFormatClass(TextOutputFormat.class);

        FileInputFormat.addInputPath(job, new Path("data/step2/input.txt"));
        Util.deleteDir("data/output");
        FileOutputFormat.setOutputPath(job, new Path("data/output/"));

        job.waitForCompletion(true);
    }
}
