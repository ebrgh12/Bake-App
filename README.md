# Bake-App
Display recipes

App should display recipes from provided network resource.

App Navigation

App should allow navigation between individual recipes and recipe steps.

Utilization of RecyclerView

App uses RecyclerView and can handle recipe steps that include videos or images.

# Components and Libraries

CRITERIA

Master Detail Flow and Fragments

Application uses Master Detail Flow to display recipe steps and navigation between them.

Exoplayer(MediaPlayer) to display videos

Application uses Exoplayer to display videos.

Proper utilization of video assets

Application properly initializes and releases video assets when appropriate.

Proper network asset utilization

Application should properly retrieve media assets from the provided network links. It should properly handle network requests.

UI Testing

Application makes use of Espresso to test aspects of the UI.

Third-party libraries

Application sensibly utilizes a third-party library to enhance the app's features. That could be helper library to interface with ContentProviders if you choose to store the recipes, a UI binding library to avoid writing findViewById a bunch of times, or something similar.
