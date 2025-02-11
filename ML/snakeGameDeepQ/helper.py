import matplotlib.pyplot as plt
from IPython import display

plt.ion()  # Turn on interactive plotting

def plot(scores, mean_scores):
    display.clear_output(wait=True)  # Clears the output for a smoother update
    display.display(plt.gcf())  # Display the current figure
    plt.clf()  # Clear the figure to make sure it updates

    # Set the title, labels, and limits
    plt.title('Training Progress', fontsize=16)
    plt.xlabel('Number of Games', fontsize=12)
    plt.ylabel('Score', fontsize=12)
    
    # Plot scores and mean_scores with different colors and line styles
    plt.plot(scores, label='Score', color='blue', linestyle='-', linewidth=2)
    plt.plot(mean_scores, label='Mean Score', color='orange', linestyle='--', linewidth=2)
    
    # Add gridlines to the plot
    plt.grid(True)

    # Add a legend to explain the lines
    plt.legend(loc='upper left')

    # Set the y-axis limit to ensure no negative values
    plt.ylim(ymin=0)

    # Add the latest score and mean score as text on the plot
    plt.text(len(scores)-1, scores[-1], str(scores[-1]), fontsize=10, color='blue', ha='right')
    plt.text(len(mean_scores)-1, mean_scores[-1], str(mean_scores[-1]), fontsize=10, color='orange', ha='right')

    # Show the plot without blocking the execution
    plt.show(block=False)
    plt.pause(0.1)  # Pause briefly to update the plot

