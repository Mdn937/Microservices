package com.example.EurekaClientThree;

public class Response {

	private Sample sample;

	private Demo demo;

	public Response() {
		// TODO Auto-generated constructor stub
	}

	public Response(Sample sample, Demo demo) {
		// TODO Auto-generated constructor stub
		this.sample = sample;
		this.demo = demo;
	}

	public Sample getSample() {
		return sample;
	}

	public void setSample(Sample sample) {
		this.sample = sample;
	}

	public Demo getDemo() {
		return demo;
	}

	public void setDemo(Demo demo) {
		this.demo = demo;
	}

}
