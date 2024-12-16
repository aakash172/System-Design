# Flyweight Design Pattern

The Flyweight Design Pattern is an excellent way to optimize memory usage by reusing shared data across multiple objects. Below is a structured guide to implement the Flyweight Pattern, including creating a setter method for shared data.

## Steps to Implement Flyweight Pattern

### 1. Define Shared and Unique Data
- **Shared Data (Intrinsic):** Data common to many objects.
- **Unique Data (Extrinsic):** Data specific to individual objects and passed externally.

### 2. Flyweight Interface
Create an interface or abstract class that defines the operations that Flyweight objects must implement.

### 3. Concrete Flyweight Class
- Implements the Flyweight interface.
- Contains intrinsic (shared) data.
- Includes a setter method to update shared data if needed.

### 4. Flyweight Factory
- Maintains a pool of Flyweight objects.
- Ensures shared objects are reused instead of creating new ones.

### 5. Client Code
- Uses the Flyweight objects.
- Provides the extrinsic data as needed.
