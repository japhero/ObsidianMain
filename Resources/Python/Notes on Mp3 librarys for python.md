Pydub Crash Course
==================


## Basic Usage

Here's how to load an audio file with Pydub:


```python
from pydub import AudioSegment

audio = AudioSegment.from_file("path/to/file.mp3")
```

And here's how to save an audio file:



```python
audio.export("path/to/newfile.mp3", format="mp3")
```
*** 

## Slicing Audio


You can slice audio using the [] operator. For example, to slice the first 10 seconds of an audio file:



```python
first_10_seconds = audio[:10000]
```
***

## Concatenating Audio


You can concatenate audio using the + operator. For example, to concatenate two audio files:



```python
audio1 = AudioSegment.from_file("path/to/file1.mp3")
audio2 = AudioSegment.from_file("path/to/file2.mp3")

combined = audio1 + audio2
```
***

## Modifying Audio


You can modify audio using various effects. For example, to increase the volume of an audio file:



```python
louder_audio = audio + 6
```
***

## Exporting Audio


You can export audio to various formats using the export method. For example, to export an audio file as a WAV:



```python
audio.export("path/to/newfile.wav", format="wav")
```
***

## Playback


You can play audio using Pydub's playback module. For example, to play an audio file:



```python
from pydub.playback import play

audio = AudioSegment.from_file("path/to/file.mp3")
play(audio)
```

